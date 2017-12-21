# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "gps_umd metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gps-common gpsd-client"
SRC_URI = "https://github.com/swri-robotics-gbp/gps_umd-release/archive/release/lunar/gps_umd/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1af1e1df9d909b7b5d8af2b87d6eef32"
SRC_URI[sha256sum] = "2070ad10e2991948fdacf2dec2789daa84194142e680bc6e3949b86a2bee8b6b"
S = "${WORKDIR}/gps_umd-release-release-lunar-gps_umd-0.2.0-0"

inherit catkin

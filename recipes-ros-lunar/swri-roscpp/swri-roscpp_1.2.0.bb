# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_roscpp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater nav-msgs roscpp std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_roscpp/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f44dc4c677ccdff740ad82dd4f3bc5a4"
SRC_URI[sha256sum] = "d77a155888a38ac0e6c1840e36d2e4f72a2519d2af5c05b46ca20533fc19e3e8"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_roscpp-1.2.0-0"

inherit catkin

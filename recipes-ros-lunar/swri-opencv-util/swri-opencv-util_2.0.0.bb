# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_opencv_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_opencv_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a7c7d331973a92f569060c6a5a57d4b"
SRC_URI[sha256sum] = "492ae76c974d65e27136a98ebe2484f54aa88109dd440bb20837b69f17433811"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_opencv_util-2.0.0-0"

inherit catkin

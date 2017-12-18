# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_system_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_system_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc80dca1dbb6a1d17a45c52c0676904c"
SRC_URI[sha256sum] = "6ae2a7ab1705911572c71a643324acfbf671a223e7541905f6997841da25eabe"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_system_util-2.0.0-0"

inherit catkin

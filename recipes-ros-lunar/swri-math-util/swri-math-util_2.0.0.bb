# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_math_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_math_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b86794f6ed1b40d66a4779fc5c7c3700"
SRC_URI[sha256sum] = "073c2fd12a2adc348ff14fb85c6d4cddf3b702fcede8994e14483ae31cfd7877"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_math_util-2.0.0-0"

inherit catkin

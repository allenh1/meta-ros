# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "These are a very simple version of some of the functions in ecl_converters      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_converters_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c39f48f191c6d4d542bf6f04c0298b40"
SRC_URI[sha256sum] = "91bfe1c4fed127f72f0fdf43a7b828a5eb5b6397824dd8a2593e0c43cfbf7114"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_converters_lite-0.61.6-0"

inherit catkin

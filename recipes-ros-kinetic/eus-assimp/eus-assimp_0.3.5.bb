# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "eus_assimp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp-devel catkin-native euslisp pkgconfig roseus"
SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/kinetic/eus_assimp/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b73ccda192809d125c28580f6207c90e"
SRC_URI[sha256sum] = "bcdee52ade1032c9f9857ac2e43bd6c4dc0cabc771d8cd576afbbd8608affb9d"
S = "${WORKDIR}/jsk_model_tools-release-release-kinetic-eus_assimp-0.3.5-0"

inherit catkin

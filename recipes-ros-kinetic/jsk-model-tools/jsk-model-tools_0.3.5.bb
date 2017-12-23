# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eus-assimp euscollada"
SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/kinetic/jsk_model_tools/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9be26c083bab43b985e55d090f45c9ce"
SRC_URI[sha256sum] = "039862e043462dcef5d911972467f543e8590e8b3fbb53ceeff8ff42387313e9"
S = "${WORKDIR}/jsk_model_tools-release-release-kinetic-jsk_model_tools-0.3.5-0"

inherit catkin

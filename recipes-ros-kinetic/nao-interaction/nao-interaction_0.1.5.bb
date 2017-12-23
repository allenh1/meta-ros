# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nao-audio nao-interaction-launchers nao-interaction-msgs nao-vision"
SRC_URI = "https://github.com/ros-naoqi/nao_interaction-release/archive/release/kinetic/nao_interaction/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5cbbc2a9aaa600eb0a83632e95fe4887"
SRC_URI[sha256sum] = "c0b618ca1076c25019642d782afb2f680cc957734fe4559b82a91d0dcacfe2c7"
S = "${WORKDIR}/nao_interaction-release-release-kinetic-nao_interaction-0.1.5-0"

inherit catkin

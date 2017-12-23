# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkin wrapper for the official ARSDK from Parrot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "autoconf automake catkin-native curl ffmpeg libavahi-client-dev libavahi-core-dev libncurses-dev libtool nasm unzip yasm zlib"
SRC_URI = "https://github.com/AutonomyLab/parrot_arsdk-release/archive/release/kinetic/parrot_arsdk/3.12.61-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e8db60f403f62173213377faed3d051e"
SRC_URI[sha256sum] = "972335b3b48ede8024acb4670b7fa0a000a92a9bd70307ba224f373d15191f7a"
S = "${WORKDIR}/parrot_arsdk-release-release-kinetic-parrot_arsdk-3.12.61-0"

inherit catkin

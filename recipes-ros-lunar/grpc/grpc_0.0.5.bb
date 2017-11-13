# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Catkinized gRPC Package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "autoconf catkin-native git libtool rsync"
SRC_URI = "https://github.com/CogRobRelease/catkin_grpc-release/archive/release/lunar/grpc/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "631bdd6da0a20904394a131a62e6c6b0"
SRC_URI[sha256sum] = "e8ca827db493a6eff92fc7250ecaee3e309fbe3695b7e5106d61df091ee24175"
S = "${WORKDIR}/catkin_grpc-release-release-lunar-grpc-0.0.5-0"

inherit catkin

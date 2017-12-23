# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "meshes for the Aldebaran Robotics NAO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=cc423ec78844eb7f9a98d5df4d0f6289"

DEPENDS = "catkin-native java"
SRC_URI = "https://github.com/ros-naoqi/nao_meshes-release/archive/release/kinetic/nao_meshes/0.1.11-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b5e00fd3b6da5c5eae3c0bd1068d8356"
SRC_URI[sha256sum] = "8e671afc307443fe67016a76bfe9dacdb33a39583c9f9f99522d099e8d64aaac"
S = "${WORKDIR}/nao_meshes-release-release-kinetic-nao_meshes-0.1.11-1"

inherit catkin

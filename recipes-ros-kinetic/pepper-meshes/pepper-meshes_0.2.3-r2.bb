# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "meshes for the Aldebaran Robotics Pepper"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=cc423ec78844eb7f9a98d5df4d0f6289"

DEPENDS = "catkin-native java"
SRC_URI = "https://github.com/ros-naoqi/pepper_meshes-release/archive/release/kinetic/pepper_meshes/0.2.3-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eba45208c177fb4f3e49da041f1c0f43"
SRC_URI[sha256sum] = "0a09c49dbdab8f7a533c9ac348ad6e65582f7cece91a6dda9368ce64509cf86a"
S = "${WORKDIR}/pepper_meshes-release-release-kinetic-pepper_meshes-0.2.3-2"

inherit catkin

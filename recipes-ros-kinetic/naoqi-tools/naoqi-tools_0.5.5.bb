# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Set of tools provided by Aldebaran to convert Aldebaran files (URDF, blender...)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-naoqi/naoqi_bridge-release/archive/release/kinetic/naoqi_tools/0.5.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76abf66907aad34346aa12557e053b56"
SRC_URI[sha256sum] = "0726936c961c62b2a6a27ce93955da72ef18de77e8e56980128e97ed20321139"
S = "${WORKDIR}/naoqi_bridge-release-release-kinetic-naoqi_tools-0.5.5-0"

inherit catkin

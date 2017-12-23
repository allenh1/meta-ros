# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ecto bindings for common opencv functionality."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native ecto opencv-candidate"
SRC_URI = "https://github.com/ros-gbp/ecto_opencv-release/archive/release/kinetic/ecto_opencv/0.7.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d701221e9915fdfa03b0de47ea97d88a"
SRC_URI[sha256sum] = "006226c8e58af9547e44edf9bac67ba8d1fb3d828accabc9cad227a1e039f810"
S = "${WORKDIR}/ecto_opencv-release-release-kinetic-ecto_opencv-0.7.2-0"

inherit catkin

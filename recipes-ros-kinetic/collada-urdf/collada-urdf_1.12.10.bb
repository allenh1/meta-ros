# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a tool to convert Unified Robot Description Format (URDF) "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles assimp assimp-dev catkin-native cmake-modules collada-dom collada-parser geometric-shapes liburdfdom-dev liburdfdom-headers-dev resource-retriever roscpp tf urdf"
SRC_URI = "https://github.com/ros-gbp/collada_urdf-release/archive/release/kinetic/collada_urdf/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2add21a11549cecdcd0f1d64257a99f"
SRC_URI[sha256sum] = "61f0726ae98ec87c3ea09e9b58502cb945cf3c5cc467e403bf58334118188144"
S = "${WORKDIR}/collada_urdf-release-release-kinetic-collada_urdf-1.12.10-0"

inherit catkin

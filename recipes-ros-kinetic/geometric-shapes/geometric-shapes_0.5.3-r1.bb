# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp assimp-dev boost catkin-native eigen eigen-stl-containers console-bridge libqhull octomap pkgconfig random-numbers resource-retriever shape-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/geometric_shapes-release/archive/release/kinetic/geometric_shapes/0.5.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a606af7fbac857f4b2fdcca2d63dadb2"
SRC_URI[sha256sum] = "6da99e2c74ec9592c4812811c32389e733dfe1f1202fdf1b6ccf8b5d27ae721d"
S = "${WORKDIR}/geometric_shapes-release-release-kinetic-geometric_shapes-0.5.3-1"

inherit catkin

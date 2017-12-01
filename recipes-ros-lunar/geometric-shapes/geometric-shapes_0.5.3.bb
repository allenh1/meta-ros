# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp assimp-dev boost catkin-native eigen eigen-stl-containers console-bridge libqhull octomap pkgconfig random-numbers resource-retriever shape-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/geometric_shapes-release/archive/release/lunar/geometric_shapes/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c5b5a8a5afb05fe049f60e0be6bde3a"
SRC_URI[sha256sum] = "d467aed74d2d66208fdb475f61850414cbabfb04d5d96bbb5efa5b85bfe14798"
S = "${WORKDIR}/geometric_shapes-release-release-lunar-geometric_shapes-0.5.3-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains generic definitions of geometric shapes and bodies."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp assimp-dev boost catkin eigen eigen-stl-containers console-bridge libqhull octomap pkgconfig random-numbers resource-retriever shape-msgs visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/geometric_shapes-release/archive/release/lunar/geometric_shapes/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b8d4a5137033102cab483efed6ba1b51"
SRC_URI[sha256sum] = "839c89a1ab8cfa449ccda82be2573f4054dfc2f15e1876bdd7d40b91f4a58379"
S = "${WORKDIR}/geometric_shapes-release-release-lunar-geometric_shapes-0.5.2-0"

inherit catkin

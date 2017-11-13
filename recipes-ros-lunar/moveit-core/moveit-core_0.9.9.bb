# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost catkin-native eigen eigen-conversions eigen-stl-containers geometric-shapes geometry-msgs kdl-parser console-bridge libfcl-dev liburdfdom-dev liburdfdom-headers-dev moveit-msgs octomap octomap-msgs pkgconfig random-numbers roslib rostime sensor-msgs shape-msgs srdfdom std-msgs trajectory-msgs urdf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_core/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "72557840681c28f82f00f321bf3f0168"
SRC_URI[sha256sum] = "cdf77a7c21a93b39312b430a734fc1bb92a96fc48917f52770cf687f25b99b7c"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_core-0.9.9-0"

inherit catkin

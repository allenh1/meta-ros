# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost catkin-native eigen eigen-conversions eigen-stl-containers geometric-shapes geometry-msgs kdl-parser console-bridge libfcl-dev liburdfdom-dev liburdfdom-headers-dev moveit-msgs octomap octomap-msgs pkgconfig random-numbers roslib rostime sensor-msgs shape-msgs srdfdom std-msgs trajectory-msgs urdf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_core/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "08fd9993bc9eb8fa2db23ece8b78d669"
SRC_URI[sha256sum] = "771f757d97a2d1e97dc774bc29fda1ba4e0113f41db56710b84d38b22f659e35"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_core-0.9.10-0"

inherit catkin

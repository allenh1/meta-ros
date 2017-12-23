# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost catkin-native eigen eigen-conversions eigen-stl-containers geometric-shapes geometry-msgs kdl-parser console-bridge libfcl-dev liburdfdom-dev liburdfdom-headers-dev moveit-msgs octomap octomap-msgs pkgconfig random-numbers roslib rostime sensor-msgs shape-msgs srdfdom std-msgs trajectory-msgs urdf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/kinetic/moveit_core/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5aa3ea9198a091475a2b5efd9fb4f9f6"
SRC_URI[sha256sum] = "49bb672f3fd83d0a7c3553aa9a36faf9467551958548c9350b59549487cfbe9c"
S = "${WORKDIR}/moveit-release-release-kinetic-moveit_core-0.9.10-0"

inherit catkin

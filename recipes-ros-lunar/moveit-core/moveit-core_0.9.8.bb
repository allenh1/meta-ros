# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Core libraries used by MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp boost catkin-native eigen eigen-conversions eigen-stl-containers geometric-shapes geometry-msgs kdl-parser console-bridge libfcl-dev liburdfdom-dev liburdfdom-headers-dev moveit-msgs octomap octomap-msgs pkgconfig random-numbers roslib rostime sensor-msgs shape-msgs srdfdom std-msgs trajectory-msgs urdf visualization-msgs"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_core/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2a2507fbef11c106c09e8ee5c8a1efd"
SRC_URI[sha256sum] = "4a3defb3595580a67beb1bb0a854dde1a78642ad66614adff1f50fffa3c5dba1"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_core-0.9.8-0"

inherit catkin

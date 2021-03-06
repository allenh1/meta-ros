# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for publishing graphs of different data types"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/davetcoleman/graph_msgs-release/archive/release/lunar/graph_msgs/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9174bb7d413dfc104107d951e8dad19c"
SRC_URI[sha256sum] = "599d1b5ec0878c8c7153be8e5fcbd0a1503631a13b2f5b02469c4a5da60c49ec"
S = "${WORKDIR}/graph_msgs-release-release-lunar-graph_msgs-0.1.0-0"

inherit catkin

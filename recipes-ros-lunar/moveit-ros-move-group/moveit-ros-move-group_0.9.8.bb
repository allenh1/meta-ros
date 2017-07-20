# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The move_group node for MoveIt"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib catkin moveit-core moveit-kinematics moveit-ros-planning pluginlib std-srvs tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_move_group/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "282546e01183f38888554526f26ead11"
SRC_URI[sha256sum] = "c3e22581e77f021c64790f4c03185785b3d709e9a6f0b67582c35dc117930c5c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

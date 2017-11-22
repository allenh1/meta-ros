# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt that offer visualization"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin eigen geometric-shapes interactive-markers moveit-ros-perception moveit-ros-planning-interface moveit-ros-robot-interaction moveit-ros-warehouse object-recognition-msgs pkgconfig pluginlib roscpp rospy rviz"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_visualization/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d18cbbd54b118be3f9314531dfbfa300"
SRC_URI[sha256sum] = "d1cc273652e7e05530349b1dbf3d1fb87b266f0b5d4a424ceae324dbf7500e5c"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_visualization-0.9.9-0"

inherit catkin

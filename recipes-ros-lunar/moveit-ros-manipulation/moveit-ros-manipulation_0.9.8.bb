# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt used for manipulation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib catkin dynamic-reconfigure eigen moveit-core moveit-msgs moveit-ros-move-group moveit-ros-planning pluginlib rosconsole roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_manipulation/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78d595ec5dc9443ce3648561a4fafad8"
SRC_URI[sha256sum] = "250eb1c55ad6139c24234e92b3daddca5a3d3afc97d089ed575f71b8d37e0d74"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_manipulation-0.9.8-0"

inherit catkin

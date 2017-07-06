# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin moveit_core pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_controller_manager_example/0.9.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "339b894032b7e96542d33e635c38b024"
SRC_URI[sha256sum] = "4445f828fd0c57e16e87326376ad64ff5b450c12ffafcd8609578edd991cb286"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

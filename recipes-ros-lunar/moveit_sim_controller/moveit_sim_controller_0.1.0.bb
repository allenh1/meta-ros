# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin moveit_core moveit_ros_planning ros_control_boilerplate roscpp roslint rosparam_shortcuts"
SRC_URI = "https://github.com/davetcoleman/moveit_sim_controller-release/archive/release/lunar/moveit_sim_controller/0.1.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e47a00d8ff76144c3b155cb1e83c9367"
SRC_URI[sha256sum] = "3e9a2912db06295e56f371319799553d965fb92367cd10620a8d41a6b61545f6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

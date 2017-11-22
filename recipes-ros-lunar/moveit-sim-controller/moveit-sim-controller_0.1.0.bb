# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simulation interface for a hardware interface for ros_control, and loads defau"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin moveit-core moveit-ros-planning ros-control-boilerplate roscpp roslint rosparam-shortcuts"
SRC_URI = "https://github.com/davetcoleman/moveit_sim_controller-release/archive/release/lunar/moveit_sim_controller/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "131fd54a77dce857b51d80e9310d1075"
SRC_URI[sha256sum] = "9cd5698fa5789a94c942d58c15b5a71f68e3066ee85e6d9bcd588aa2a6e071d3"
S = "${WORKDIR}/moveit_sim_controller-release-release-lunar-moveit_sim_controller-0.1.0-0"

inherit catkin

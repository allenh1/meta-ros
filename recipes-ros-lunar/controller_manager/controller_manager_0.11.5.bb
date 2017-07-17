# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The controller manager."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=3535527b87878c756abbc970ef8031c1"

DEPENDS = "catkin controller_interface controller_manager_msgs hardware_interface pluginlib realtime_tools"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager/0.11.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8de7e9c3b495ce3970c06e5cb259dcac"
SRC_URI[sha256sum] = "2fde8ecdbcb857cb1be9ee9378da0b7258f62e8ddd882bfb4dcd438f6e80c50c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

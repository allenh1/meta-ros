# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin combined_robot_hw combined_robot_hw_tests controller_interface controller_manager controller_manager_msgs controller_manager_tests hardware_interface joint_limits_interface realtime_tools transmission_interface"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/ros_control/0.11.5-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ebaff008d55e6cac0424a956f91ca21"
SRC_URI[sha256sum] = "b8481d4b8012be6b0d1c46e144d8d0d548c61d3983d00cbd498e1bf8dabbfd90"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

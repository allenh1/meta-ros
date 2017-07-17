# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage which extends ros_base and includes ROS libaries for any robot har"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin control_msgs diagnostics executive_smach filters geometry robot_model robot_state_publisher ros_base xacro"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/robot/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78d2dcf92b7b189f48b817b0548524cb"
SRC_URI[sha256sum] = "0cb38875da1568d6ffcfef3e4c48fd194a2c96908fe302274c51311021cd59b2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

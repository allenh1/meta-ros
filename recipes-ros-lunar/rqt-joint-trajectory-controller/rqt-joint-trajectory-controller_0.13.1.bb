# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Graphical frontend for interacting with joint_trajectory_controller instances."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Modified-BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=9fe507396161b9e47d2b1e01c422787a"

DEPENDS = "catkin control-msgs controller-manager-msgs rospy rqt-gui rqt-gui-py trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/rqt_joint_trajectory_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d477ad32d3a80cf7eff2db3057128779"
SRC_URI[sha256sum] = "23f7694f247aae3b712585c10923148040273df8f9f381b5d2c3aa8ad02ad401"
S = "${WORKDIR}/ros_controllers-release-release-lunar-rqt_joint_trajectory_controller-0.13.1-0"

inherit catkin

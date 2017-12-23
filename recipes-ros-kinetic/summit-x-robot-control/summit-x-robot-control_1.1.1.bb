# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Control the robot joints in all kinematic configurations, publishes odom topic a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs robotnik-msgs roscpp sensor-msgs tf"
SRC_URI = "https://github.com/RobotnikAutomation/summit_x_sim-release/archive/release/kinetic/summit_x_robot_control/1.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1b0b68dd056ed68b56477de3fa78316e"
SRC_URI[sha256sum] = "956ff4fcb79a48c86900de082ebaffad54e7ebf32d41cb4503ebca8f2d0ec426"
S = "${WORKDIR}/summit_x_sim-release-release-kinetic-summit_x_robot_control-1.1.1-0"

inherit catkin

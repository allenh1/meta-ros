# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo launchers and worlds for TurtleBot simulation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depthimage-to-laserscan diagnostic-aggregator gazebo-ros kobuki-gazebo-plugins robot-pose-ekf robot-state-publisher turtlebot-bringup turtlebot-description turtlebot-navigation xacro yocs-cmd-vel-mux"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_simulator-release/archive/release/kinetic/turtlebot_gazebo/2.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "99e74923b2e11e38a950fd0ce8d5ff2e"
SRC_URI[sha256sum] = "197945ab613a6cff82f22e71e5b20504fb3bc6997457bdc0934a78f3810d28cf"
S = "${WORKDIR}/turtlebot_simulator-release-release-kinetic-turtlebot_gazebo-2.2.3-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Stdr version of turtlebot simulation. Convenient to test 2D-navigation related s"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native navigation stdr-gui stdr-resources stdr-robot stdr-server turtlebot-bringup turtlebot-navigation yocs-velocity-smoother yocs-virtual-sensor"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_simulator-release/archive/release/kinetic/turtlebot_stdr/2.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6c99f516592522257f15222fa436944e"
SRC_URI[sha256sum] = "e434f3c0a8a9410c54a97390f256e4ac5a58574713d0eecfcf2f968affa4265e"
S = "${WORKDIR}/turtlebot_simulator-release-release-kinetic-turtlebot_stdr-2.2.3-0"

inherit catkin

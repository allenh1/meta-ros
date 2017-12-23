# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages, serivices and actions for SawYer roch"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native message-generation message-runtime sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/SawYerRobotics-release/roch_robot-release/archive/release/kinetic/roch_msgs/2.0.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b69acfc400a3c46b1adc12cd5ed793d3"
SRC_URI[sha256sum] = "1a0a22982e97d7420ccff601e07108efc51183525e01b34b6a69a6957b39b979"
S = "${WORKDIR}/roch_robot-release-release-kinetic-roch_msgs-2.0.15-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides teleoperation using joysticks or keyboard."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs joy kobuki-safety-controller roscpp turtlebot-bringup yocs-velocity-smoother"
SRC_URI = "https://github.com/turtlebot-release/turtlebot-release/archive/release/kinetic/turtlebot_teleop/2.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fe80089a404d16b728076b60b2d32138"
SRC_URI[sha256sum] = "bea11a0f8177cd5d22af74b12ca02a61755dac877b0c4f723ae692a96e79c67a"
S = "${WORKDIR}/turtlebot-release-release-kinetic-turtlebot_teleop-2.4.2-0"

inherit catkin

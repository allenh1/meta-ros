# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generic joystick teleop for twist robots."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs joy roscpp roslaunch roslint rostest sensor-msgs"
SRC_URI = "https://github.com/ros-teleop/teleop_twist_joy-release/archive/release/kinetic/teleop_twist_joy/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "decd9eb20a7a9ac5b3f0e9818d22c3f0"
SRC_URI[sha256sum] = "6a141782c5aa3ad7a9c5bbe052200fc5aca04b9932a3f570f67f18c302063ecf"
S = "${WORKDIR}/teleop_twist_joy-release-release-kinetic-teleop_twist_joy-0.1.2-0"

inherit catkin

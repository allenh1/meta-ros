# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Defines the messages that are used to communicate with the     p2os_driver packa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_msgs/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "af91f4957c576386f5daa338ecb1d93f"
SRC_URI[sha256sum] = "f31012d50530d2f7561f0cfd676cf37274e5dc9eb7994f2ed4b902a26605006e"
S = "${WORKDIR}/p2os-release-release-lunar-p2os_msgs-2.1.0-0"

inherit catkin

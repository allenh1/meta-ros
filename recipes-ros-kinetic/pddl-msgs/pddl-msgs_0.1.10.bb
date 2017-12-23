# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "message for pddl planner"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib actionlib-msgs catkin-native message-generation message-runtime"
SRC_URI = "https://github.com/tork-a/jsk_planning-release/archive/release/kinetic/pddl_msgs/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce8f23db4a56f92647a0ee3b356b903c"
SRC_URI[sha256sum] = "90b3431f779c8d9db5d15d509e22dd1a7fc9761da0f03b2c8cee140964ca1d19"
S = "${WORKDIR}/jsk_planning-release-release-kinetic-pddl_msgs-0.1.10-0"

inherit catkin

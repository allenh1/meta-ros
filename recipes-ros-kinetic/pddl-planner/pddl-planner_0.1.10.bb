# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "pddl planner wrappers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib catkin-native downward ff ffha lpg-planner pddl-msgs rospy time"
SRC_URI = "https://github.com/tork-a/jsk_planning-release/archive/release/kinetic/pddl_planner/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "658410e1169b77eee1489420b790d5f1"
SRC_URI[sha256sum] = "c42e8ab697a8851635ef3341593cb500993611ac22bb55d97094ec92ddc8c08a"
S = "${WORKDIR}/jsk_planning-release-release-kinetic-pddl_planner-0.1.10-0"

inherit catkin

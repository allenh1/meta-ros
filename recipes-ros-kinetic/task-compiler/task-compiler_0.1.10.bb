# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "task_compiler       Compiler that translate task description in PDDL (Planning D"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native pddl-planner roseus-smach"
SRC_URI = "https://github.com/tork-a/jsk_planning-release/archive/release/kinetic/task_compiler/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3270a02e2e7d9b4b46f2231ad7e4bcb"
SRC_URI[sha256sum] = "2191991cc36b6a91b40d68ce8224f3ace51fa6af0ea14ca07b5271ca471e6052"
S = "${WORKDIR}/jsk_planning-release-release-kinetic-task_compiler-0.1.10-0"

inherit catkin

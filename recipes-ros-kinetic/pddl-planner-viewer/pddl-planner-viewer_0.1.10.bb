# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "a viewer of pddl_planner."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native pddl-planner"
SRC_URI = "https://github.com/tork-a/jsk_planning-release/archive/release/kinetic/pddl_planner_viewer/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "62f137b9895640a7fbf77902dea07ab0"
SRC_URI[sha256sum] = "08e145556c84fb223f370ab0ee0aacc938102e6d09675c59b00842b1b15f462e"
S = "${WORKDIR}/jsk_planning-release-release-kinetic-pddl_planner_viewer-0.1.10-0"

inherit catkin

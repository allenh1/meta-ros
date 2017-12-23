# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multikey_teleop is a node for robot teleoperation.       It uses keyboard to pro"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native geometry-msgs python-xlib rospy std-msgs"
SRC_URI = "https://github.com/easymov/multikey_teleop-release/archive/release/kinetic/multikey_teleop/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "18c96d3ef80b5b3c72f5f3a5622b8b83"
SRC_URI[sha256sum] = "801f6571875fe3632ecbefd9496194795f2e6e745824087e8a6fffd20f19c15b"
S = "${WORKDIR}/multikey_teleop-release-release-kinetic-multikey_teleop-1.0.0-0"

inherit catkin

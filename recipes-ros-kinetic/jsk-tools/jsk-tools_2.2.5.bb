# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Includes emacs scripts, ros tool alias generator, and launch doc generator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native cv-bridge git iproute2 jsk-gui-msgs jsk-network-tools jsk-topic-tools python-colorama python-percol python-pygithub3 python-requests python-slacker-cli python-tabulate-pip python-texttable rosbag rosemacs rosgraph-msgs rospy rqt-reconfigure"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/jsk_tools/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10e1c90eedbba2d5cc9bbbb0ab1931a6"
SRC_URI[sha256sum] = "61341d7a4861db76bdcad5f4b9d8fcd956ad1cb98631ea9ee733cde01b540b50"
S = "${WORKDIR}/jsk_common-release-release-kinetic-jsk_tools-2.2.5-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_script_server package provides a simple interface to operate Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs catkin-native cob-light cob-mimic cob-sound control-msgs geometry-msgs ipython message-generation message-runtime move-base-msgs python-pygraphviz rospy rostest std-msgs std-srvs tf trajectory-msgs"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_script_server/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54755258bc7245e152cfb45eb84b6712"
SRC_URI[sha256sum] = "5d5b437bf9148dc644ecbf83b01dc3e45d00cbd76c3adea9478ba70d8d154427"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_script_server-0.6.6-0"

inherit catkin

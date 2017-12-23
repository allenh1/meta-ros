# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides nodes that broadcast tf-frames along various (model-based)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs boost catkin-native cob-frame-tracker cob-srvs cob-twist-controller geometry-msgs message-generation message-runtime robot-state-publisher roscpp roslint rospy rviz std-msgs std-srvs tf topic-tools visualization-msgs xacro"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_cartesian_controller/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6524bdd9a60324850ad3ce3792e5b1fe"
SRC_URI[sha256sum] = "e973d3cd35ec2af207122635f7e7b04f761fc1c2b98e8f55b1300f03c400d906"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_cartesian_controller-0.7.0-0"

inherit catkin

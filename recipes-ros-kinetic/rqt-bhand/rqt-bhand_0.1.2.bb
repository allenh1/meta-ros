# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_bhand package is intended to test the Barrett Hand in graphical mode"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bhand-controller catkin-native python-rospkg rostopic rqt-gui rqt-gui-py sensor-msgs"
SRC_URI = "https://github.com/RobotnikAutomation/barrett_hand-release/archive/release/kinetic/rqt_bhand/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2bb0eae18facd05e1a4f5c8fdf7c183"
SRC_URI[sha256sum] = "e324a9ecdcabb3c34e3658cfa19fa62afe1789e04d68a57af2b936ab6032caf0"
S = "${WORKDIR}/barrett_hand-release-release-kinetic-rqt_bhand-0.1.2-0"

inherit catkin

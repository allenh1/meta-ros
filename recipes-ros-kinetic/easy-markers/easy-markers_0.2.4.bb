# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python library to assist in publishing markers easily"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs interactive-markers roslib rospy tf visualization-msgs"
SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/kinetic/easy_markers/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b388ca8915ec00ca3d462cbe3822105a"
SRC_URI[sha256sum] = "23ff1f37c017bc511dd6643fb9dbab42fc15ac9137f0ce2071b4da67202ebe99"
S = "${WORKDIR}/wu_ros_tools-release-kinetic-easy_markers-0.2.4-0"

inherit catkin

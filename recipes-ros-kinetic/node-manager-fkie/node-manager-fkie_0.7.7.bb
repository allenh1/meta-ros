# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Graphical interface, written in PySide, to manage the running and       configur"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=261b66671071bbaa4ac3e568151c48bc"

DEPENDS = "catkin-native default-cfg-fkie diagnostic-msgs dynamic-reconfigure master-discovery-fkie master-sync-fkie multimaster-msgs-fkie python-docutils python-paramiko python-qt-binding rosgraph roslaunch roslib rosmsg rospy rosservice rqt-gui rqt-reconfigure screen xterm"
SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/kinetic/node_manager_fkie/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c31d9f011cc891c69f12886e843a8e6e"
SRC_URI[sha256sum] = "0ffceaae2c312b2d9b2ba2b1b80dafb52ded7d1e1497165c54757e0f844b3206"
S = "${WORKDIR}/multimaster_fkie-release-release-kinetic-node_manager_fkie-0.7.7-0"

inherit catkin

# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_common provides common functionality for rqt plugins written in Python.
 "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "actionlib catkin genmsg genpy python_qt_binding qt_gui rosbag roslib rospy rostopic std_msgs"
SRC_URI = "https://github.com/ros-gbp/rqt-release/archive/release/lunar/rqt_py_common/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "36d3a46ea20c70ca3a6eb5d9ff4e19fb"
SRC_URI[sha256sum] = "72adcb2aaaf16a170544e33b2ff18b8ae8a0c0eeda7404fdeb810e2361b4b8eb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin

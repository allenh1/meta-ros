# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Service pair libraries for pub/sub non-blocking services."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genpy python-catkin-pkg-native python-pyyaml rocon-console rocon-service-pair-msgs rosgraph roslib rosnode rospy rosservice rostest rostopic unique-id uuid-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_python_comms/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "419cf0a6bc8c36763eef331abb9d30fc"
SRC_URI[sha256sum] = "241eb85920e0822ea5f6bb9911d5dc0cf3ff32c6ccddc5d5acc9e09029d17699"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_python_comms-0.3.2-1"

inherit catkin

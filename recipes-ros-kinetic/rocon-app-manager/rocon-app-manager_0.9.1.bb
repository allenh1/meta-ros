# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The public interface and retaskable interface for a robot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "capabilities catkin-native gateway-msgs python-catkin-pkg-native rocon-app-manager-msgs rocon-app-utilities rocon-apps rocon-console rocon-gateway rocon-gateway-utils rocon-hub rocon-interactions rocon-master-info rocon-python-comms rocon-python-utils rocon-std-msgs rocon-uri roslib roslint rosmaster rospy rostest std-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_app_platform-release/archive/release/kinetic/rocon_app_manager/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53dfa14b62a59f4c2ad3ea3fc21b623b"
SRC_URI[sha256sum] = "0a98c3ac6b0c3cc39536fe4249ede6a346966de74ae45468f1289edded4ada22"
S = "${WORKDIR}/rocon_app_platform-release-release-kinetic-rocon_app_manager-0.9.1-0"

inherit catkin
